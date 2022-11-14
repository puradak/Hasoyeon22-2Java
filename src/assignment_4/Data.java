package assignment_4;

public class Data {
	public Subject[] major = {
			new Subject("물리학"		,true,true,Subject.setValuationStd(),2,1),
			new Subject("수학"		,true,true,Subject.setValuationStd(),3,2),
			new Subject("수치해석"	,true,false,Subject.setValuationStd(),2,3),
			new Subject("컴퓨터구조"	,true,false,Subject.setValuationStd(),3,4),
			new Subject("영어"		,true,false,Subject.setValuationStd(),2,5),
			new Subject("자바"		,true,false,Subject.setValuationStd(),2,6)
	};
	public Subject[] ge = {
			new Subject("GNU인성"		,false,false,Subject.setValuationStd(),2,7),
			new Subject("범죄와인권"		,false,false,Subject.setValuationStd(),2,8),
			new Subject("북한정치와사회"	,false,false,Subject.setValuationStd(),3,9),
			new Subject("환경과오염"		,false,false,Subject.setValuationStd(),3,10),
			new Subject("배드민턴"		,false,false,Subject.setValuationStd(),1,11),
			new Subject("볼링"			,false,false,Subject.setValuationStd(),1,12)
	};
	public String[] firstName = {
			"김","남","도","류","마","박"
	};
	
	public String[] lastName = {
			"경해","선우","영현","바다","지후","하늘"
	};
}
