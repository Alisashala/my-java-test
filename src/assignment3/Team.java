package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Team {
    private ArrayList<TeamMember> members = new ArrayList<>();

    /**
     * @param m an instance of TeamMember
     *          Adds a teammember to the instance field members
     */
    public void addTeamMember(TeamMember m) {
        members.add(m);
    }

    // Nothing to do here!
    public void addTeamMembers(ArrayList<TeamMember> t) {
        members.addAll(t);
    }

    // Nothing to do here!
    public ArrayList<TeamMember> getAllMembers() {
        return members;
    }

    /**
     * @param m the TeamMember to remove
     * @return if a TeamMember was removed
     */
    public boolean removeTeamMember(TeamMember m) {
        members.remove(m);

        if (members.remove(m)) {

        }
        return true;
    }

    /**
     * @return the next available id
     * The id must start at 0. If a member is removed from the list,
     * the id must be freed for the next member.
     * The next id must always be the smallest possible id number
     * <p>
     * * This is hard. Skip this for now if you don't know how to do it
     */

    public int getNextId() {

       int id = 0;

        if (members.isEmpty()) {
            return id = 0;
        }
        return id;
    }

    /**
     * @param role, a String representing the role of the TeamMember
     * @return an ArrayList of all TeamMember that has the specified role
     */
    public ArrayList<TeamMember> retriveMembersByRole(String role) {
        return null;

    }

    /**
     * Sort the TeamMember list in ascending order by name
     * * This is hard. Skip this for now if you don't know how to do it
     */
    public void sortByNameAsc() {

        Collections.sort(members, new Comparator<TeamMember>() {

            @Override
            public int compare(TeamMember a, TeamMember b) {
                return CharSequence.compare(a.getName(), b.getName());
            }

        });
    }

        /**
         * Sort the TeamMember list in descending order by role
         *
         * * This is hard. Skip this for now if you don't know how to do it
         */
        public void sortByRoleDesc() {

        //TODO Delete line below, and implement this method
            throw new UnsupportedOperationException();

        }

    }


