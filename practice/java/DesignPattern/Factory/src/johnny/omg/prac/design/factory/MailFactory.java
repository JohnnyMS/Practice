package johnny.omg.prac.design.factory;

public class MailFactory implements AbstractFactory {

	@Override
	public Sender produceSender() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
