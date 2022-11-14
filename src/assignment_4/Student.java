package assignment_4;

import java.util.Random;

public class Student {
	public String name;			// 학생 이름
	public int number;			// 학번
	public int major_credit;	// 전공 과목 학점
	public int ge_credit;		// 교양 과목 학점
	public Subject[] major;		// 전공 과목 모음
	public Subject[] ge;		// 교양 과목 모음
	public Data ds;				// 과목 정보를 받아올 객체
	public Random rand;
	
	public Student(int number) {
		super();
		this.name = "";
		this.number = number;
		this.major_credit = 0;
		this.ge_credit = 0;
		this.ds = new Data();
		this.rand = new Random();
		
		init_name();
		init_subject("m");
		init_subject("g");
		init_total_credit();
	}
	
	public void init_subject(String kind) {
		int credit_cur = 0;
		int credit_limit = 0;
		Subject[] subjects = null;
		
		if(kind.toLowerCase().equals("m")) {
			credit_limit = 11;
			subjects = ds.major;
			for(int i=0;; i++) {
				Subject subject = subjects[rand.nextInt(6)];
				if(Subject.isExistSubject(this.major,subject) || Subject.isExistSubject(this.ge,subject)) {
					i--;
					continue;
				}
				credit_cur += subject.credit;
				if( credit_cur > credit_limit ) return;
				
				this.major[i] = subject;
			}
		}
		else if(kind.toLowerCase().equals("g")) {
			credit_limit = 8;
			subjects = ds.ge;
			for(int i=0; ; i++) {
				Subject subject = subjects[rand.nextInt(6)];
				if(Subject.isExistSubject(this.major,subject)) continue;
				if(Subject.isExistSubject(this.ge,subject)) continue;
				credit_cur += subject.credit;
				if( credit_cur > credit_limit ) return;			
				this.ge[i] = subject;
			}
		}
		else return;
	}

	public void init_name() {
		this.name += ds.firstName[rand.nextInt(6)];
		this.name += ds.lastName[rand.nextInt(6)];
	}
	
	public void init_total_credit() {
		for(Subject s : major) {
			this.major_credit += s.credit;
		}
		for(Subject s : ge) {
			this.ge_credit += s.credit;
		}
	}
	// parameter input
	// kind :: m : major, g : ge
	public boolean isVaildCredit(String kind) {
		int credit_limit = 0;
		Subject[] subject = null;
		
		if(kind.toLowerCase().equals("m")) {
			credit_limit = 11;
			subject = major;
		}
		else if(kind.toLowerCase().equals("g")) {
			credit_limit = 8;
			subject = ge;
		}
		int credit_sum = 0;
		for(int i=0; i<subject.length; i++) {
			credit_sum += subject[i].credit;
		}
		
		if(credit_sum > credit_limit) return false;
		else return true;
	}
	
}
