package ru.otus.example.beansscopesdemo.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Scope(scopeName = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Service
public class SessionGreetingService extends AbstractGreetingService {
}
