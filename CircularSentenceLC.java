public class CircularSentenceLC {
    public boolean isCircularSentence(String sentence) {
        int len=sentence.length();
        if(sentence.charAt(0)!=sentence.charAt(len-1)) return false;
        for(int i=0;i<len;i++){
            if(sentence.charAt(i)==' '){
                if(sentence.charAt(i-1)!=sentence.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }
}
// it was a easy problem to solve took 5 mins
