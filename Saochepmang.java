public class Saochepmang {
    
        public static void main(String[] args) {
            char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 
                    'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
            char[] copyTo = new char[7];
            //Dùng phương thức arraycopy để sao chép mảng
            System.arraycopy(copyFrom, 2, copyTo, 0, 7);
            System.out.println(new String(copyTo));
        }
}
