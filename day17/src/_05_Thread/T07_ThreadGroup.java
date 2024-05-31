package _05_Thread;

public class T07_ThreadGroup {

	public static void main(String[] args) {
		ThreadGroup groupName = Thread.currentThread().getThreadGroup();
		
		//thread 이름 출력하는 메소드
		System.out.println(groupName.getName()); // 스레드를 추가하지않으면 main 스레드만 있다
		
					//스레드 그룹 생성하면서 이름을 지정해줄 수 있다 
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		
		//스레드 그룹 하위에 스레드그룹 만드는법		//(해당그룹아래, "새로만들 하위그룹 이름")을 생성한다
		ThreadGroup subGrp1 = new ThreadGroup(grp1,"SubGroup1");
		
		Runnable r = new Runnable() {
			public void run() {
				try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		};

					//(어느 그룹에 속하는지, 런어에이블, 새로만들 하위그룹 이름)
		// Thread(ThreadGroup 변수이름,Runnerable 변수이름, 이름)
		Thread th1 = new Thread(grp1, r, "th1");
		Thread th2 = new Thread(subGrp1, r, "th12");
		Thread th3 = new Thread(grp2, r, "th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		//Thread들의 이름 가져오는법
		System.out.println("List of ThreadGroup : " + groupName.getName()); 
		
		//지금 현재 돌아가고있는 스레드 그룹 출력 // 그룹이 몇개 활성화 되어있는지
		System.out.println("Active ThreadGroup : " + groupName.activeGroupCount()); //메인포함 3개
		
		//몇개의 스레드가 돌아가고있는지(그룹 x)
		System.out.println("Active ThreadGroup : " + groupName.activeCount()); //메인 포함 4개
		
		groupName.list();
		
		
		
		// 데몬 스레드 (daemon thread)
		/*
		 - 일반 스레드(non-daemon thread)의 작업을 돕는 보조적인 역할을 수행.
		 - 일반 스레드가 모두 종료되면 자동적으로 종료된다.
		 - 가비지 컬렉터, 자동저장, 화면자동갱신 등에 사용된다.
		 - 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다.
		
		스레드 클래스 생성후
		스레드클레스이름.setDaemon(true); 를 .start 전에 써주면 해당 쓰레드를 데몬으로 쓰겠다라는 뜻
		
		
		
		
		
		*/
		
		
	}

}
