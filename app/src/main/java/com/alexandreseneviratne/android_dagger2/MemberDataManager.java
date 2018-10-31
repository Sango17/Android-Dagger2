package com.alexandreseneviratne.android_dagger2;

import java.util.ArrayList;

/**
 * Created by Alexandre SENEVIRATNE on 31/10/2018.
 */
public class MemberDataManager {
    private String memberStatus;
    private ArrayList<Member> members = new ArrayList<>();

    public MemberDataManager() {
        populateMembers();
    }

    public String checkMemberStatus(String inputMember) {
        memberStatus = "Access Denied";

        for (Member m : members) {
            if (m.getMemberId().equals(inputMember)) {
                memberStatus = "Access Granted";
            }
        }

        return memberStatus;
    }

    private void populateMembers() {
        members.add(new Member("123", "Alex", "alex@gmail.com"));
        members.add(new Member("321", "Amanda", "amanda@gmail.com"));
        members.add(new Member("231", "Tempo", "tempo@gmail.com"));
    }
}
