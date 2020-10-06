class ApartBaseStation {
	public int solution(int n, int[] stations, int w) {
		int answer = 0; // ������ ����
		int position = 1; //����Ʈ �� ������
		int si = 0;
		
		while (position<=n) {
			if(si < stations.length && stations[si]-w <= position) {
				position = stations[si] + w + 1;
				si += 1;
			} else {
				answer += 1; //�������� �����
				position += w * 2 + 1;//���Ĺ��� ���� ������ ������ �̵�
			}
		}
		
//		Queue<Integer> sq = new LinkedList<>();
//		
//		for (int s : stations) {
//			sq.offer(s);
//		}
		
		
//		while (position <= n) {
//			if(!sq.isEmpty() && sq.peek() - w <= postion) {//���� Ȯ������ ���� ������ �ϳ��� ������ �ش� ������ ���� �����ǰ� ���Ͽ� ���ԵǸ�
//				postion = sq.poll() + w + 1;
//			} else {
//				answer += 1; //�������� �����
//				position += w * 2 + 1;//���Ĺ��� ���� ������ ������ �̵�
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
