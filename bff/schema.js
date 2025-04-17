import { gql } from 'apollo-server';

const typeDefs = gql`
  type User {
    id: ID
    username: String
    blockedUsers: [String]
  }

  type ActivityLog {
    id: ID
    username: String
    action: String
    timestamp: Float
  }

  type Query {
    getUser(username: String!): User
    getLogs(username: String!): [ActivityLog]
  }

  type Mutation {
    signup(username: String!, password: String!): String
    login(username: String!, password: String!): String
    blockUser(username: String!, blockedUsername: String!): String
  }
`;

export default typeDefs;
