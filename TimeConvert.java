public class TimeConvert {
    public static void main(String[] args) {
        String time = "01:02:59AM";
        System.out.println(timeConversion(time));
        time = "12:02:59AM";
        System.out.println(timeConversion(time));
        time = "12:00:00AM";
        System.out.println(timeConversion(time));
        time = "12:00:00PM";
        System.out.println(timeConversion(time));
        time = "01:02:46PM";
        System.out.println(timeConversion(time));
        time = "11:02:46PM";
        System.out.println(timeConversion(time));
    }

    public static String timeConversion(String s) {
        StringBuilder militaryTime = new StringBuilder();
        if (s.charAt(8) == 'A') {
            if ("12".equals(s.substring(0, 2))) {
                militaryTime.append("00");
                militaryTime.append(s.substring(2, 8));
            } else {
                militaryTime.append(s.substring(0, 8));
            }
        } else {
            if ("12".equals(s.substring(0, 2))) {
                militaryTime.append(s.substring(0, 8));
            } else {
                militaryTime.append(Integer.parseInt(s.substring(0, 2)) + 12);
                militaryTime.append(s.substring(2, 8));
            }
        }
        return militaryTime.toString();
    }
}