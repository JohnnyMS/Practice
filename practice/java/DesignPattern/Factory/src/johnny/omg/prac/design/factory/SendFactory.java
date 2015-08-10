package johnny.omg.prac.design.factory;


public class SendFactory {
	public Sender produceSender(String type){
		if(type.equals("mail")){
			return new MailSender();
		}
		if(type.equals("sms")){
			return new SmsSender();
		}
		System.out.println("error type: " + type);
		return null;
	}
}
