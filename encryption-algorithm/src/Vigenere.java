import java.util.Scanner;

/*
* 维吉尼亚加密算法
*
* */
public class Vigenere {

    static char[] wordTable = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z' };

    public static void main(String[] args) {

        char[][] vigenereTable = creatVigenereTable();

        Scanner sin = new Scanner(System.in);
        System.out.println("请输入你想进行加密的明文：");
        String mingwenStr = sin.nextLine();
        char[] mingwen = mingwenStr.toCharArray();
        System.out.println("请设置一个密钥：");
        String miyaoStr = sin.nextLine();
        char[] miyao = miyaoStr.toCharArray();

        int mingwenLength = mingwen.length;
        int miyaoLength = miyao.length;

        char[] miwen = jiami(mingwenLength, miyaoLength, mingwen, miyao,
                vigenereTable);
        System.out.print("用维吉尼亚算法进行加密后的密文是：");
        for (int s = 0; s < mingwenLength; s++) {
            System.out.print(miwen[s]);
        }
        System.out.println();

        char[] miyao111 = qiumiyao(mingwenLength, mingwen, miwen, vigenereTable);
        System.out.print("根据密文推断密钥是：");
        for(int i=0; i<miyao111.length; i++){
            System.out.print(miyao111[i]);
        }
        System.out.println();
        // for (int m = 0; m < 26; m++) {
        // for (int n = 0; n < 26; n++) {
        // System.out.print(vigenereTable[m][n]);
        // }
        // System.out.println();
        // }

    }

    public static char[][] creatVigenereTable() {

        char[][] vigenereTable = new char[26][26];

        int i = 0;
        for (int x = 0; x < 26; x++) {
            for (int y = 0; y < 26; y++) {
                vigenereTable[x][y] = wordTable[i];
                i++;
            }
            i = x + 1;
        }
        return vigenereTable;
    }

    private static char[] jiami(int mingwenLength, int miyaoLength,
                                char[] mingwen, char[] miyao, char[][] vigenereTable) {
        // 现在开始加密
        char[] miwen = new char[mingwenLength];
        int miyaol = 0;

        for (int mingwenl = 0; mingwenl < mingwenLength; mingwenl++) {

            for (int wordTablel = 0; wordTablel < 26; wordTablel++) {

                if (mingwen[mingwenl] == wordTable[wordTablel]) {

                    for (int wordTablel2 = 0; wordTablel2 < 26; wordTablel2++) {

                        if (miyao[miyaol] == wordTable[wordTablel2]) {

                            miwen[mingwenl] = vigenereTable[wordTablel][wordTablel2];
                        }
                    }
                }
            }

            // 是miyaol+1，而不是miyaol，不然会报数组下标越界的错，找了很久的错，记住
            if (miyaol + 1 <= miyaoLength - 1) {
                miyaol++;
            } else {
                miyaol = 0;
            }
        }

        return miwen;
    }

    private static char[] qiumiyao(int mingwenLength, char[] mingwen,
                                   char[] miwen, char[][] vigenereTable) {
        //先得到一个跟明文一样长度的密钥，稍后根据循环重复的部分判断密钥具体是什么
        char[] miwenTest = null;
        char[] miyaoTest = new char[mingwenLength];//测试密钥假设跟明文长度一样，因为最长不会超过这个长度
        char[] miyao = null;//实际的密钥现在不知道长度，所以没有初始化
        int mingwenl;
        int miyaol=0;
        for (mingwenl=0 ; mingwenl < mingwenLength; mingwenl++) {

            for (int wordTablel = 0; wordTablel < 26; wordTablel++) {

                if (mingwen[mingwenl] == wordTable[wordTablel]) {

                    for (int wordTablel2 = 0; wordTablel2 < 26; wordTablel2++) {

                        if(miwen[mingwenl] == vigenereTable[wordTablel][wordTablel2]) {
                            miyaoTest[miyaol] = wordTable[wordTablel2];
                        }

                    }
                }
            }
            miyao = new char[mingwenl+1];//初始化密钥数组，还未赋值，此时长度假设的是跟测试到第几位明文的长度一样
            System.arraycopy(miyaoTest, 0, miyao, 0, mingwenl+1);//把此时此刻的假设的跟测试到第几位明文的长度一样的假设密钥赋值给 上面定义的密钥数组，稍后测试
            miwenTest = jiami(mingwenLength, miyaol+1, mingwen, miyao, vigenereTable);
            String miwenA = String.valueOf(miwenTest);
            String miwenB = String.valueOf(miwen);
            if(miwenA.equals(miwenB)) {
                break;
            }
            miyaol++;
        }
        return miyao;
    }

}

