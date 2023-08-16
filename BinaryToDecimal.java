public static int BinaryToDecimal(String Binary){
        int result=0;
        int power=0;
        for(int i=Binary.length()-1;i>=0;i--){
            result+=(Integer.parseInt(String.valueOf(Binary.charAt((i)))))*(Math.pow(2,power));
            power++;
        }
        return result;
    }
