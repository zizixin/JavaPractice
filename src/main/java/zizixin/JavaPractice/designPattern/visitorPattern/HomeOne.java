package zizixin.JavaPractice.designPattern.visitorPattern;

public class HomeOne implements AllowedVisitor{

	@Override
	public void accept(VisitAbility visitAbility) {
		System.out.println("homeOne has allowed"+visitAbility.getName()+"Visit");
		visitAbility.visit(this);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
