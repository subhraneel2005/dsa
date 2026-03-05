import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReducePath {
    public static void main(String[] args) {
        String ogPath = "/../";
        List<String> parsedArrayOfPath = parsePath(ogPath);
        System.out.println("array: " + parsedArrayOfPath);

        String reducedPath = getReducedPath(parsedArrayOfPath);
        System.out.println("reduced path: " + reducedPath);
    }

    // output: "/home/../..tmp//./"

    // break this into: ["/", "home", "..", "..", "tmp", "."]

    // ignore last "/" and combine multiple consequetive "/" into one "/"

    static String getReducedPath(List<String> parsedArrayList) {
        Stack<String> dirs = new Stack<String>();

        for (String item : parsedArrayList) {

            if (item.equals("/"))
                continue;

            if (item.equals("."))
                continue;

            if (item.equals("..")) {
                if (!dirs.isEmpty()) {
                    dirs.pop();
                }
            }

            else
                dirs.push(item);

        }

        StringBuilder sb = new StringBuilder();

        for (String dir : dirs) {
            sb.append("/").append(dir);
        }

        String result = sb.toString();

        return result.isEmpty() ? "/" : result;
    }

    static List<String> parsePath(String path) {
        List<String> result = new ArrayList<>();

        if (path == null || path.isEmpty())
            return result;

        // split by one or more "/"
        String[] parts = path.split("/+");

        // if absolute path, add root
        if (path.startsWith("/")) {
            result.add("/");
        }

        for (String part : parts) {
            if (!part.isEmpty()) {
                result.add(part);
            }
        }

        return result;

    }
}