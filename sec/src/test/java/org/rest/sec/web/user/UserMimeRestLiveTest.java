package org.rest.sec.web.user;

import org.rest.common.client.IEntityOperations;
import org.rest.sec.client.template.UserTestRestTemplate;
import org.rest.sec.model.UserEntityOpsImpl;
import org.rest.sec.model.dto.User;
import org.rest.sec.test.SecMimeRestLiveTest;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMimeRestLiveTest extends SecMimeRestLiveTest<User> {

    @Autowired
    private UserTestRestTemplate api;
    @Autowired
    private UserEntityOpsImpl entityOps;

    public UserMimeRestLiveTest() {
        super();
    }

    // tests

    // template method

    @Override
    protected final UserTestRestTemplate getApi() {
        return api;
    }

    @Override
    protected final IEntityOperations<User> getEntityOps() {
        return entityOps;
    }

}