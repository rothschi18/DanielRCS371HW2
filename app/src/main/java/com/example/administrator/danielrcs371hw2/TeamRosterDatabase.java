package com.example.administrator.danielrcs371hw2;

import android.widget.Button;

import java.util.HashMap;

/**
 * Created by rothschi18 on 9/19/2015.
 */
public class TeamRosterDatabase {
    private HashMap<String, TeamRoster> rosterDatabase;
    //I have set a limit on the total teams that can be made
    private int totalTeams;

    public void TeamRosterDatabase()
    {
        totalTeams = countTeams();
        rosterDatabase = new HashMap<String, TeamRoster>();
    }

    public void addTeam(TeamRoster newTeam)
    {
        String key = newTeam.teamName;
        if(totalTeams>11)
            return;
        if(rosterDatabase.containsKey(key))
        {
            return;
        }

        rosterDatabase.put(key, newTeam);
    }

    public void deleteTeam(String key)
    {

        if(rosterDatabase.containsKey(key))
        {
            rosterDatabase.remove(key);
        }

    }

    public TeamRoster getTeam(String key)
    {
        return rosterDatabase.get(key);
    }

    public int countTeams()
    {
        return rosterDatabase.size();
    }
    //Displays the teams in the Main Activity
    public int viewTeams()
    {
        int counter = 1;
        for(String key: rosterDatabase.keySet())
        {
            String buttonId = "team" + counter;
            Button showName = (Button)findViewById(R.id.)

        }

    }
}
