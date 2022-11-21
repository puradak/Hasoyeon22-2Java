package assignment_5.data;

import assignment_5.object.General;
import assignment_5.object.Major;

public class Subject_data {
	public static Major[] majors = {
			new Major("물리학"	,true,2,1),
			new Major("수학"		,true,3,2),
			new Major("수치해석"	,false,2,3),
			new Major("컴퓨터구조",false,3,4),
			new Major("영어"		,false,2,5),
			new Major("자바"		,false,2,6)
	};
	
	public static General[] generals = {
			new General("GNU인성"		,2,7),
			new General("범죄와인권"		,2,8),
			new General("북한정치와사회"	,3,9),
			new General("환경과오염"		,3,10),
			new General("배드민턴"		,1,11),
			new General("볼링"			,1,12)
	};
}
