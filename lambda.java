interface Auto{
	void bookAuto(String pickup,String drop);
}

class Main {
public static void main(String[] args) {
	Auto auto=(pickup,drop)->{
		System.out.println("ola auto is booked from "+pickup+" to "+drop+" Enjoy the safe ride");
};
auto.bookAuto("chennai","banglore");
}
} 
