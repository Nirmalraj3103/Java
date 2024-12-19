package javaTask;

class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class AverageOf extends Thread {
    private Subject[] subjects;

    public AverageOf(Subject[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public void run() {
        int sum = 0;
        for (Subject subject : subjects) {
            sum = sum + subject.getMarks();
        }
        double avg = (double) sum / subjects.length;
        System.out.println("Average marks: " +avg);
    }
}

public class SubjectAverage {
	public static void main(String[] args) {
        Subject[] subjects = new Subject[] {
            new Subject("Tamil", 86),
            new Subject("English", 90),
            new Subject("Maths", 91),
            new Subject("Science", 99),
            new Subject("Social", 97),
        };
        
        AverageOf sum = new AverageOf(subjects);
        sum.start();
    }

}
