import java.util.*;
public class insert{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;  //eow=end of word

        public Node(){
            for(int i=0; i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node cur = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(cur.children[idx]==null){
                cur.children[idx] = new Node();
            }
           cur =cur.children[idx];
        }
        cur.eow = true;
    }
    public static boolean search(String key){
         Node cur = root;
        for(int level=0;level<key.length();level++){
            int idx = key.charAt(level)-'a';
            if(cur.children[idx]==null){
                cur.children[idx] = new Node();
            }
           cur =cur.children[idx];
        }
        return  cur.eow = true;
    }

    public static boolean wordBreak(String key){
        for(int i=1; i<=key.length();i++){
            if(search(key.substring(beginIndex:0,i))&&
                wordBreak( key.substring(i))){
                    return true;
                }
         }
        return false;
    }

    public static void main(String args[]){
       /* String words[] = {"the","a","there","their","any","thee"};
        for(int i=0; i<words.length ; i++){
            insert(words[i]);
        }

        System.out.println(search("thee"));
        */
        String arr[] = {"the","a","there","their","any","thee"};
        for(int i=0; i<arr.length ; i++){
            insert(arr[i]);
        }
        String key = "thereaany";
    }
}