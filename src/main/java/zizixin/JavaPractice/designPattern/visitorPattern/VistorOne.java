package zizixin.JavaPractice.designPattern.visitorPattern;

public class VistorOne implements VisitAbility{

	@Override
	public void visit(AllowedVisitor allowedVisitor) {
		System.out.println(this.getName()+"is visit"+allowedVisitor.getName());
		//allowedVisitor.accept(this);
	}

	@Override
	public String getName() {
		return "VISITOR ONE";
	}

}
