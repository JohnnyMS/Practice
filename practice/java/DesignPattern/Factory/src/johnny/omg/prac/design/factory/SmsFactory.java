package johnny.omg.prac.design.factory;

public class SmsFactory implements AbstractFactory {

	@Override
	public Sender produceSender() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
