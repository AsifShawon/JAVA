package Task2;

public class MyString1 {
    private char[] data;

    public MyString1(String str){
        data = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            this.data[i] = str.charAt(i);
        }
    }

    public char charAt(int index){
        return data[index-1];
    }
    public int length(){
        return data.length;
    }
    public MyString1 substring(int begin, int end){
        String str = "";
        for(int i=begin, j=0; i<end; i++, j++){
            str += data[i];
        }

        return new MyString1(str);
    }
    public boolean equals(MyString1 s){
        for(int i=1; i<=s.length(); i++){
            if(s.charAt(i)!=this.charAt(i)) return false;
        }
        return true;
    }
    public MyString1 toUpperCase(){
        String str;
        for(int i=0; i<data.length; i++){
            data[i] = Character.toUpperCase(data[i]);
        }
        return new MyString1(new String(data));
    }

    public String toString(){
        return new String(data);
    }
}
