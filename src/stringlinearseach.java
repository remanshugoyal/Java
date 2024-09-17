public class stringlinearseach {
    public static void main(String[] args) {

                String str="remanshu";
                char target = 'm';
                int ans=Linearsearch(str, target);
                System.out.println(ans);
            }
            static int Linearsearch(String arr, char target){
if(arr.length()==0){
    return -1;
        }
                for (int i=0;i<=arr.length();i++){
                    char element = arr.charAt(i);
                    if(element==target){
                        return i;
                    }
                }
                return -1;

        }

    }

