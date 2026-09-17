class Solution{
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Queue<Integer> queue = new LinkedList<>();
        for (int student: students) {
            queue.offer(student);
        }

        int result = n;
        for (int sandwich: sandwiches) {
            int counter = 0;
            while (counter < n && queue.peek() != sandwich) {
                queue.offer(queue.poll());
                counter++;
            }
            if (queue.peek() == sandwich) {
                queue.poll();
                result--;
            } else {
                break;
            }
        }

        return result;
    }
}