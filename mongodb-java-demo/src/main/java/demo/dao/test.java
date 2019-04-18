public class test {

    public static int getHash(String theString){
        return theString.hashCode();
    }

    public static void main(String[] args){
        String companyName = "Google";
        String programName = "CodeU";
        long currentYear = 2019;
        long companyHash = getHash(companyName);
        long programHash = getHash(programName);
        long codeuLuckyNumber = companyHash + programHash + currentYear;
        System.out.println(" " + codeuLuckyNumber + " ");
        int sum = "Google".hashCode() + "CodeU".hashCode() + 2019;
        System.out.println(sum);
    }

}
