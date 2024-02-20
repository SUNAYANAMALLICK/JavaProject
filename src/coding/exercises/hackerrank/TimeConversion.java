package coding.exercises.hackerrank;

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        Character format = s.charAt(s.length()-2);

        int hr = Integer.parseInt(s.substring(0, 2));

        if(hr==12){
            if(format=='A'){
                return "00"+s.substring(3, s.length()-2);
            }else if(format=='P'){
                return "00"+s.substring(3, s.length()-2);

            }
        }else if(hr>12 && hr<24){
            if(format=='A'){
                return String.valueOf(hr-12)+s.substring(2, s.length()-2);
            }else if(format=='P'){
                return String.valueOf(hr-12)+s.substring(2, s.length()-2);

            }
        }else if(hr==24){
            if(format=='A'){
                return "00"+s.substring(3, s.length()-2);
            }else if(format=='P'){
                return "00"+s.substring(3, s.length()-2);

            }
        } else if (hr<12) {
            if(format=='A'){
                return String.valueOf(hr-12)+s.substring(2, s.length()-2);
            }else if(format=='P'){
                return String.valueOf(hr+12)+s.substring(2, s.length()-2);

            }
        }
        return null;


    }

    public static void main(String[] args) {

        System.out.println(timeConversion("07:05:45PM"));

    }
}
