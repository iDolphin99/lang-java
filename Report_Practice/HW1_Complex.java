package Report_Practice;

public class HW1_Complex {
	double real, imaginary; // real은 실수 imaginary는 허수 저장 

	// 임의의 실수 부분과 허수 부분을 가진 객체 생성자
	public HW1_Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	} 

	// 허수 부분이 0인 객체 생성자
	public HW1_Complex(double real) {
		this(real, 0.0);
	} 

	// 객체의 복소수 부분을 표시
	void print() {
		System.out.println(real + " + " + imaginary + "i");
	} 
}