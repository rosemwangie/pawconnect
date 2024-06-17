import React from 'react';

// Define a function to fetch data
async function fetchUsers() {
  try {
    const response = await fetch( 'http://localhost:8082/api/v1/users', {
      // Required for server-side fetching
      next: { revalidate: 60 },
    } );
    if ( !response.ok ) {
      console.error( 'HTTP error:', response.status, response.statusText );
      throw new Error( `Failed to fetch users: ${response.statusText}` );
    }
    return await response.json();
  } catch ( error ) {
    console.error( 'Fetch users failed:', error.message );
    throw error;
  }
}

// Define your Server Component
const Page = async () => {
  let users;
  try {
    users = await fetchUsers();
  } catch ( error ) {
    // Handle the error, possibly by showing an error message in the UI
    return (
      <div>
        <h1>Error fetching users</h1>
        <p>{error.message}</p>
      </div>
    );
  }

  return (
    <div>
      <h1>Users</h1>
      <ul>
        {users.map( ( user: any ) => (
          <li key={user.id}>{user.name}</li>
        ) )}
      </ul>
    </div>
  );
};

export default Page;
