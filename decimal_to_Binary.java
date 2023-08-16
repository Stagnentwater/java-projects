public static StringBuilder decimalToBinary(int x){
        if(x==0){
            StringBuilder b=new StringBuilder("0");
            return b;
        }
        StringBuilder damn=new StringBuilder();
        while(x>0){
            int reminder =x%2;
            damn.insert(0, reminder);
            x/=2;
        }
        return damn;

    }
