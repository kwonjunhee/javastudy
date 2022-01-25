package prob2;

public class SmartPhone extends Phone {

	@Override
	public void execute(String function) {
		if(function.equals("앱")) {
			this.playApp();
		} else if (function.equals("음악")) {
			this.playMusic();
		} else if (function.equals("통화")){
			super.execute(function);
		}
	}
	
	private void playApp() {
		System.out.println("앱실행");
		
	}
	private void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
}
