public class Opgave2 {
    int assignmentPoints;
    int examPoints;
    int projectPoints;
    String grade;

    int addAssignmentPoints(int points){
        return assignmentPoints += points;
    }

    int addExamPoints(int points){
        return examPoints += points;
    }

    int addProjectPoints(int points){
        return projectPoints += points;
    }

    void addPoints(int points, String type){
        if(type.equals("1")){
            assignmentPoints += points;
        } else if (type.equals("2")){
            examPoints += points;
        } else if (type.equals("3")){
            examPoints += points;
        }

    }

    void printTotal(){
        //int total = assignmentPoints + examPoints + projectPoints;
        System.out.println("Your total score is: " + getTotal());

    }

    int getTotal(){
        int total = assignmentPoints + examPoints + projectPoints;
        //System.out.println("Your total score is: " + total);
        return total;
    }

    void whatGrade() {
        if (getTotal() >= 90) {
            grade = "A";
        } else if (getTotal() >= 75 && getTotal() < 90) {
            grade = "B";
        } else if (getTotal() >= 60 && getTotal() < 75) {
            grade = "C";
        } else if (getTotal() >= 45 && getTotal() < 60){
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is: " + grade);

    }

    void main(){
        //addAssignmentPoints(25);
        //addExamPoints(40);
        //addProjectPoints(30);
        addPoints(0,"1");
        addPoints(20,"2");
        addPoints(20,"3");

        printTotal();
        whatGrade();

    }
}
