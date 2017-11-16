package JavaPractice.leetcode.LongestPalindromicSubstring;

public class SolutionOn3 {

	
	public String longestPalindrome(String targetString){
		
		char[] targetStringChars = targetString.toCharArray();
		
		int maxPalindromLength = 0;
		
		String maxPalindromString = null;
		
		for(int i=0;i<targetStringChars.length;i++){
			StringBuilder sb = new StringBuilder();
			
			for(int j= i,count=1;j<targetStringChars.length;count++,j++){
				sb.append(targetStringChars[j]);
				if(checkIfTargetStringIsPalindrom(sb.toString())){
					if(maxPalindromLength<count){
						maxPalindromLength = count;
						maxPalindromString = sb.toString();
					}
				}
			}
		}
		
		
		return maxPalindromString;
	}
	
	private Boolean checkIfTargetStringIsPalindrom(String targetString){
		if(targetString.length()==1){
			return true;
		}
		int targetStringLength = targetString.length();
		char[] targetStringArray = targetString.toCharArray();
		if(targetStringLength%2==0){
			
			int targetStringLengthHalf = targetStringLength/2;
			
			if(targetStringArray[targetStringLengthHalf] == targetStringArray[targetStringLengthHalf-1]){
				Boolean flag = true;
				for(int i=0;i<targetStringLengthHalf-1;i++){
					if(targetStringArray[i] != targetStringArray[targetStringLength-1-i]){
						flag = false;
						break;
					}
				}
				if(flag==true){
					return true;
				}
			}
			
		}else{
			int targetStringLengthHalf = targetStringLength/2;
			Boolean flag = true;
			for(int i=0;i<targetStringLengthHalf;i++){
				if(targetStringArray[i]!=targetStringArray[targetStringLength-1-i]){
					flag = false;
					break;
				}
			}
			if(flag==true){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(new SolutionOn3().longestPalindrome("jrjnbctoqgzimtoklkxcknwmhiztomaofwwzjnhrijwkgmwwuazcowskjhitejnvtblqyepxispasrgvgzqlvrmvhxusiqqzzibcyhpnruhrgbzsmlsuacwptmzxuewnjzmwxbdzqyvsjzxiecsnkdibudtvthzlizralpaowsbakzconeuwwpsqynaxqmgngzpovauxsqgypinywwtmekzhhlzaeatbzryreuttgwfqmmpeywtvpssznkwhzuqewuqtfuflttjcxrhwexvtxjihunpywerkktbvlsyomkxuwrqqmbmzjbfytdddnkasmdyukawrzrnhdmaefzltddipcrhuchvdcoegamlfifzistnplqabtazunlelslicrkuuhosoyduhootlwsbtxautewkvnvlbtixkmxhngidxecehslqjpcdrtlqswmyghmwlttjecvbueswsixoxmymcepbmuwtzanmvujmalyghzkvtoxynyusbpzpolaplsgrunpfgdbbtvtkahqmmlbxzcfznvhxsiytlsxmmtqiudyjlnbkzvtbqdsknsrknsykqzucevgmmcoanilsyyklpbxqosoquolvytefhvozwtwcrmbnyijbammlzrgalrymyfpysbqpjwzirsfknnyseiujadovngogvptphuyzkrwgjqwdhtvgxnmxuheofplizpxijfytfabx"));
	}
}
