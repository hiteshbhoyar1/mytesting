package interface_study;

public interface Father1 {
	default void add() {
		System.out.println("the addition method of father1");
	}
	void sub();
	void mul();

}
