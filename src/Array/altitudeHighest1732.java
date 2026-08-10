package Array;

public class altitudeHighest1732 {
    public static void main(String[] args) {
        int[] gain ={-5, 1, 5, 0, -7};
        int altitude =0;
        int highest =0;

        for(int g: gain){
            altitude +=  g;
            highest = Math.max(highest, altitude);

            System.out.println("g=" +g+",altitude="+altitude+",highest="+highest);
        }
        System.out.println("Answer= "+highest);
    }
}
