import java.io.FilterOutputStream;
import java.util.HashSet;
import java.util.Set;

class SkillAnalyzer {
    /**
     * TO-DO: Find skills present in one set but not both.
     * For example, if candidateA has {Java, Python} and candidateB has {Python, SQL},
     * the result should be {Java, SQL}.
     \*
     * @param candidateASkills The skills of the first candidate.
     * @param candidateBSkills The skills of the second candidate.
     * @return A new HashSet containing only the unique skills for each candidate.
     */
    
    public Set<String> findUniqueSkills(Set<String> candidateASkills, Set<String> candidateBSkills) {
        // Hint: You might need to find the union and intersection first.
        // Your code here
        Set<String> unionSkills= new HashSet<>(candidateASkills);
        Set<String> intersectionSkills= new HashSet<>(candidateASkills);

         candidateASkills.retainAll(candidateBSkills);

        unionSkills.addAll(candidateBSkills);
        intersectionSkills.retainAll(candidateBSkills);

        unionSkills.removeAll(intersectionSkills);

        return unionSkills; // Placeholder

    }
}