import { GetServerSideProps } from 'next';
import axios from 'axios';
import UserList from '../components/UserList';

interface User {
  id: number;
  username: string;
  email: string;
}

interface HomeProps {
  users: User[];
}

const Home: React.FC<HomeProps> = ( { users } ) => {
  return (
    <div className="flex items-center justify-center min-h-screen bg-gray-100">
      <UserList users={users} />
    </div>
  );
};

export const getServerSideProps: GetServerSideProps = async () => {
  try {
    const response = await axios.get( 'http://localhost:8082/api/users' );
    const users: User[] = response.data;

    return {
      props: {
        users,
      },
    };
  } catch ( error ) {
    console.error( 'Error fetching users:', error );
    return {
      props: {
        users: [],
      },
    };
  }
};

export default Home;
