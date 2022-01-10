class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<dnaStrand.length();i++)
            {
                char cur=dnaStrand.charAt(i);
                if(cur=='G')
                {
                    str.append('C');
                }
                else if(cur=='C')
                {
                    str.append('G');
                }
                else if(cur=='T')
                {
                    str.append('A');
                }
                else
                {
                    str.append('U');
                }
            }
        return str.toString();
    }

}
