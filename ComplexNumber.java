class ComplexNumber {  
  
    int real, imag;   
    public ComplexNumber(int r, int i) {  
        this.real = r;  
        this.imag = i;  
    }  
  
    public void showC() {  
        System.out.print("(" + this.real + " + " + this.imag + "i" + ")");  
    }  
  
    // Addition of two complex numbers  
    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {  
  
        // Creating a new variable to store the result  
        ComplexNumber res = new ComplexNumber(0, 0);  
  
        res.real = n1.real + n2.real;  
        res.imag = n1.imag + n2.imag;  
  
        // Returning the result  
        return res;  
    }  
  
    public static void main(String arg[]) {  
  
        // Creating two complex numbers  
        ComplexNumber c1 = new ComplexNumber(4, 5);  
        ComplexNumber c2 = new ComplexNumber(10, 5);  
  
        // Printing the complex numbers  
        System.out.print("First Complex number: ");  
        c1.showC();  
        System.out.print("\nSecond Complex number: ");  
        c2.showC();  
  
        // Calling add() to perform addition  
        ComplexNumber res = add(c1, c2);  
  
        // Displaying the addition  
        System.out.println("\nAddition is :");  
        res.showC();  
    }  
} 