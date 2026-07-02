class Solution {

    public int compress(char[] chars) {

        int write = 0;
        int read = 0;
        while (read < chars.length) {
            
            char current = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            chars[write] = current;
            write++;

            if (count > 1) {
                String frequency = String.valueOf(count);

                for (char digit : frequency.toCharArray()) {
                    chars[write] = digit;
                    write++;
                }
            }
        }

        return write;
    }
}
