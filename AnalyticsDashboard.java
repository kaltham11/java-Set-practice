import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Assume the Employee class from Question 1 is available and correctly implemented.

class AnalyticsDashboard {
    /**
     * TO-DO: Find all users that are in the 'allUsers' list but NOT in the 'activeUsers' list.
     * Use HashSets for an efficient implementation.
     \*
     * @param allUsers A list of all registered Employee objects.
     * @param activeUsers A list of recently active Employee objects.
     * @return A Set of inactive Employee objects.
     */
    public Set<Employee> findInactiveUsers(List<Employee> allUsers, List<Employee> activeUsers) {
        // Your code here:
        // 1. Convert both lists to HashSets.
        // 2. Perform the set difference operation.
        // 3. Return the resulting set.
        Set<Employee> allUser=new HashSet<>(allUsers);
        Set<Employee> activeUser=new HashSet<>(activeUsers);
        allUser.removeAll(activeUser);
        return allUser; // Placeholder
    }
}