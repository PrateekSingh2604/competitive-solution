class Solution {
    public List<String> removeSubfolders(String[] folder) {
        HashSet<String> f = new HashSet<>();
        List<String> ans = new ArrayList<>();

        for(String s: folder){
            f.add(s);
            ans.add(s);
        }

        for(String s: folder){
            String check = "";
            for(int i = 0; i<s.length(); i++){
                check = check + "" + s.charAt(i);
                if(f.contains(check) && i<s.length()-1 && s.charAt(i+1) == '/'){
                    System.out.println(check);
                    ans.remove(s);
                    break;
                }
            }
        }
        return ans;
    }
}




class Solution {
  public List<String> removeSubfolders(String[] folder) {
    List<String> ans = new ArrayList<>();
    String prev = "";

    Arrays.sort(folder);

    for (final String f : folder) {
      if (!prev.isEmpty() && f.startsWith(prev) && f.charAt(prev.length()) == '/')
        continue;
      ans.add(f);
      prev = f;
    }

    return ans;
  }
}
