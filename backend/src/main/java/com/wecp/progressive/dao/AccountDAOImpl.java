package com.wecp.progressive.dao;

import java.util.*;

import com.wecp.progressive.entity.Accounts;

public class AccountDAOImpl implements AccountDAO {

        ArrayList<Accounts> a1 = new ArrayList<>(); 
    @Override
    public int addAccount(Accounts accounts) {
        // TODO Auto-generated method stub
        a1.add(accounts);
        return 1;
    }

    @Override
    public void deleteAccount(int accountId) {
        // TODO Auto-generated method stub
        for(Accounts a:a1){
            if(a.getAccount_id()==accountId){
                a1.remove(a);
            }
            
        }

        
    }

    @Override
    public Accounts getAccountById(int accountId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Accounts> getAllAccounts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateAccount(Accounts accounts) {
        // TODO Auto-generated method stub
        
    }
    
}
