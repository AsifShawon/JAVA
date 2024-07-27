package Assignment2;


class MATHS {
    public void workFor() {
        System.out.println("The work of the operator.");
    }
}

class Add extends MATHS {
	
    @Override
    public void workFor() {
        System.out.println("Addition");
    }
}

class Sub extends MATHS {
	
    @Override
    public void workFor() {
        System.out.println("Subtraction");
    }
}

public class task1 {
    public static void main(String[] args) {
        MATHS add = new Add();
        MATHS sub = new Sub();

        add.workFor();
        sub.workFor();
    }
}

