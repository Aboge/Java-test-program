public class ShiftCipher {
    /**
     *
     *  穷尽密钥搜索算法
     *
     */
        public static void main(String[]args)
        {
            String CipherText = "JXUMUQJXUHYILUHOXEJJXYIMYDJUHCQDOSXYBTHUDSQKWXJQSEBT";
            String PlainText = "";

            for(int key=0;key<26;key++)
            {

                for(int i=0;i<CipherText.length();i++)
                {
                    int temp = CipherText.charAt(i)-65; //需要将字母转化为0-25之间的数字
                    //取模存在正负，所以为保证后期计算得到的ASCII表的值区间在A～Z之间，故采用加法计算，保证最后的取余值为正
                    temp = (temp + key)%26;

//                    System.out.println(temp);
                    PlainText += (char)(temp + 65); //取余值区间为0～25，+65（A的阿斯克码表值）等效计算得到对应的字母的位置
                }
                System.out.println("key=" + (26 - key));
                System.out.println("解密原文 = " + PlainText);
                PlainText = "";
            }
        }

}