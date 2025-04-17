import fetch from 'node-fetch';

const BASE_URL = 'http://springboot-app:8080';

const resolvers = {
  Query: {
    getUser: async (_, { username }) => {
      const res = await fetch(`${BASE_URL}/user/${username}`);
      return res.json();
    },
    getLogs: async (_, { username }) => {
      const res = await fetch(`${BASE_URL}/activity/${username}`);
      return res.json();
    }
  },
  Mutation: {
    signup: async (_, { username, password }) => {
      const res = await fetch(`${BASE_URL}/auth/signup`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ username, password })
      });
      return res.text();
    },
    login: async (_, { username, password }) => {
      const res = await fetch(`${BASE_URL}/auth/login`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ username, password })
      });
      return res.text();
    },
    blockUser: async (_, { username, blockedUsername }) => {
      const res = await fetch(`${BASE_URL}/user/${username}/block`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(blockedUsername)
      });
      return res.text();
    }
  }
};

export default resolvers;
