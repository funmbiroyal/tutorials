package leetCode;

public class FirstBadVersion {
    public int findFirstBadVersion(int[] versions){
        int firstBadVersion = 4;
        int badVersion = 0; 
        for (int version : versions) {

            if (version == firstBadVersion) {
               badVersion = version;
                
            }

        }
        return badVersion;
    }


    public static void main(String[] args) {
        FirstBadVersion badVersion = new FirstBadVersion();
        int [] versions = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(badVersion.findFirstBadVersion(versions));
    }
}

