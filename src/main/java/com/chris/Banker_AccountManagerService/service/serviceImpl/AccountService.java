package com.chris.Banker_AccountManagerService.service.serviceImpl;

import com.chris.Banker_AccountManagerService.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    public Account createAccount(Account account);
    public Optional<Account> viewAccount(long id);
    public List<Account> viewAllAccounts();
    public Account editAccInfo(long id, Account account);
    public String deleteAccount(long id);
}
