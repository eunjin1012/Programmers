class Solution {
    public String solution(String letter) {
        String result = "";
        String[] answer = letter.split(" ");
        for(int i=0; i<answer.length; i++){
            if(answer[i].equals("....")){
                result+="h";
            }
            else if(answer[i].equals(".")){
                result+="e";
            }
            else if(answer[i].equals(".-..")){
                result+="l";
            }
            else if(answer[i].equals("---")){
                result+="o";
            }
            else if(answer[i].equals(".--.")){
                result+="p";
            }
            else if(answer[i].equals("-.--")){
                result+="y";
            }
            else if(answer[i].equals("-")){
                result+="t";
            }
            else if(answer[i].equals("-.")){
                result+="n";
            }
            else if(answer[i].equals(".-")){
                result+="a";
            }
            else if(answer[i].equals("-...")){
                result+="b";
            }
            else if(answer[i].equals("-.-.")){
                result+="c";
            }
            else if(answer[i].equals("-..")){
                result+="d";
            }
            else if(answer[i].equals("..-.")){
                result+="f";
            }
            else if(answer[i].equals("--.")){
                result+="g";
            }
            else if(answer[i].equals("..")){
                result+="i";
            }
            else if(answer[i].equals(".---")){
                result+="j";
            }
            else if(answer[i].equals("-.-")){
                result+="k";
            }
            else if(answer[i].equals("--")){
                result+="m";
            }
            else if(answer[i].equals("--.-")){
                result+="q";
            }
            else if(answer[i].equals(".-.")){
                result+="r";
            }
            else if(answer[i].equals("...")){
                result+="s";
            }
            else if(answer[i].equals("..-")){
                result+="u";
            }
            else if(answer[i].equals("...-")){
                result+="v";
            }
            else if(answer[i].equals(".--")){
                result+="w";
            }
            else if(answer[i].equals("-..-")){
                result+="x";
            }
            else if(answer[i].equals("--..")){
                result+="z";
            }
        }
        return result;
    }
}
