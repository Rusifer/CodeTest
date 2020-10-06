class ApartBaseStation {
	public int solution(int n, int[] stations, int w) {
		int answer = 0; // 기지국 갯수
		int position = 1; //아파트 동 포지션
		int si = 0;
		
		while (position<=n) {
			if(si < stations.length && stations[si]-w <= position) {
				position = stations[si] + w + 1;
				si += 1;
			} else {
				answer += 1; //기지국을 세우고
				position += w * 2 + 1;//전파범위 우측 밖으로 포지션 이동
			}
		}
		
//		Queue<Integer> sq = new LinkedList<>();
//		
//		for (int s : stations) {
//			sq.offer(s);
//		}
		
		
//		while (position <= n) {
//			if(!sq.isEmpty() && sq.peek() - w <= postion) {//아직 확인하지 않은 기지국 하나를 꺼내서 해당 범위를 현재 포지션과 비교하여 포함되면
//				postion = sq.poll() + w + 1;
//			} else {
//				answer += 1; //기지국을 세우고
//				position += w * 2 + 1;//전파범위 우측 밖으로 포지션 이동
//			}
//			
//			
//		}
		return answer;
	}
	
	public static void main(String[] args) {
		ApartBaseStation ap = new ApartBaseStation();
		int[] st = {11, 22, 33};
		int a = ap.solution(100, st, 1);
		
		System.out.println(a);
	}
}
