public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("prathyush");
        for(int i =0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1 -i;
            char frontchar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(back, frontchar);
            sb.setCharAt(front, backChar);
            
        }
        System.out.println(sb);
    }
}
