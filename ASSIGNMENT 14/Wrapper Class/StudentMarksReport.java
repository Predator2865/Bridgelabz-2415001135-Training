public class StudentMarksReport {

    public static void main(String[] args) {
        
        Object[] marksData = {"85", 95, Integer.valueOf(88), "null", "abc", 76};

        int total = 0;
        int count = 0;

        for (Object data : marksData) {
            Integer mark = null;

            try {
                
                if (data instanceof String) {
                    String str = (String) data;

                    
                    if (str.equalsIgnoreCase("null") || str.isEmpty()) {
                        continue;
                    }
                    mark = Integer.parseInt(str); 
                } 
                else if (data instanceof Integer) {
                    mark = (Integer) data; 
                }

                
                if (mark != null) {
                    total += mark; 
                    count++;
                }

            } catch (NumberFormatException e) {
                
                System.out.println("Invalid mark skipped: " + data);
            }
        }

                if (count > 0) {
            double average = (double) total / count;
            System.out.println("\nTotal valid marks: " + count);
            System.out.println("Average marks: " + average);
        } else {
            System.out.println("No valid marks found!");
        }
    }
}
